import type {SyntheticEvent} from "react"

export default function EventBubbling() {
    const onDivClick = (e: SyntheticEvent) => {
        const {isTrusted, target, bubbles, currentTarget} = e
            console.log('Click Event Bubbles On <div>', isTrusted, target,
                bubbles, currentTarget
            )
    }
    const onButtonClick = (e: SyntheticEvent) => {
        const {isTrusted, target, bubbles} = e
        console.log("Click Event Starts At <button>", isTrusted, target, bubbles)
    }
    return (
        <div onClick={onDivClick}>
            <p>EventBubbling</p>
            <button onClick={onButtonClick}>Click Me</button>
        </div>
    )
}