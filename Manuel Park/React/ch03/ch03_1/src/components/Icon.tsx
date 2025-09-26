import type {FC, CSSProperties} from 'react'

export type IconProps = {
    name: string
    style?: CSSProperties
    className?: string
}

export const Icon: FC<IconProps> = ({name, className, ...props}) => {
    return (
        <span {...props} className={`material-icons ${className || ''}`}>
            {name}
        </span>
    )
}